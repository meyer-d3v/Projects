
# This is a comment
try:
    x = int(input("x: "))
except ValueError:
    print("Not a valid number!")
    exit()
try: 
    y = int(input("y: "))
except ValueError:
    print("Not a valid number!")
    exit()
print(x + y)   

z = x / y

print(z)