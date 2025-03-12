import pyttsx3
from time import sleep

engine = pyttsx3.init("sapi5")

#text = input("What do want the computer to say? ")

voices = engine.getProperty("voices")

#for voice in voices:
    #print(voice.id)
    #engine.setProperty("voice", voice.id)
    #engine.say("Goodmorning sir. My name is Jarvis and I'm your personal assistant")
    #engine.runAndWait()
    #sleep(3)
    #engine.stop()

engine.setProperty("voices", "TTS_MS_EN-US_ZIRA_11.0")

engine.setProperty("rate", 180)

engine.setProperty("volume", 1.0)

engine.say("Goodmorning mister Meyer. My name is Alexis and how am I going to be helping you today?")
    
engine.runAndWait()



