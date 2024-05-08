import random

a = 'abcdefghijklmnopqrstywz1234567890'

password = ""

for x in range(16):
    password += random.choice(a)

print(f"Your password: {password}")
