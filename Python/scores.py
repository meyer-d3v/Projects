scores = []

d = int(input("How many scores do you want to add?: "))

for i in range(d):
    n = int(input("Gimme scores: "))
    scores.append(n)

average = sum(scores) / len(scores)

print(f"Average : {average}")