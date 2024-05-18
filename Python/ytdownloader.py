from pytube import YouTube
from pytube.cli import on_progress
from notify_run import Notify
from time import sleep

notify = Notify()

def download_video(url):
    try:
        yt = YouTube(url, on_progress_callback=on_progress)
        stream = yt.streams.get_highest_resolution()
        print(f"Downloading: {yt.title}")
        stream.download(r"C:\Users\Samantha\Downloads\New folder")
        yt.register_on_progress_callback(progress_function)
        print("Download Complete")
        notify.send(f"Downloaded succesfully: {stream.title}")
    except Exception as e:
        print(f"Error: {e}")
        notify.send(f"Downloaded not succesfully: {stream.title}")

def progress_function(chunk, file_handle, bytes_remaining):
    print(round((1-bytes_remaining/chunk.filesize)*100, 3), " % done ...")

f = open("C:\\Users\\Samantha\\Desktop\\Python (learning)\\textfile\\links.txt","r")

for x in f:
    if __name__ == "__main__":
        #video_url = input("Enter the url of the youtube video: ")
        download_video(x.strip())
        sleep(300)

