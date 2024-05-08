points = int(input("How many points did you lose?: "))

if points < 2:
    print("You lost fewer points than me")
elif points > 2:
    print("You lost more points than me")
else:
    print("You lost just as much points as me")