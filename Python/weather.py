import requests
from bs4 import BeautifulSoup
import pyttsx3

engine = pyttsx3.init()

r = requests.get("https://weather.com/en-ZA/weather/today/l/2f2a561189c1f6cef568e565d2819a370cd44d5b499ad1961d88f41b97e1f51d")

soup = BeautifulSoup(r.content, "html.parser")

title = soup.title.string

cur_temp = soup.find(attrs={"data-testid":"TemperatureValue"}).text

weather = soup.find(attrs={"class":"CurrentConditions--primary--2DOqs"}).text

print(" ")

print(f"\t{title}")

print(" ")

print(f"Current Temperature: {cur_temp}")

print(" ")

engine.say(f"Current Temperature: {cur_temp}")

engine.runAndWait()


