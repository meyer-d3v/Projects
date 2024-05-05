import tkinter

window = tkinter.Tk()

window.title("My first GUI")

Font = ("Ariel", 16, "bold")

label = tkinter.Label(window,text="Please fill in this form!", font=Font).pack(pady=15)

f_name = tkinter.Label(window,text="First name: ").pack()

entry = tkinter.Entry(window)

entry.pack(pady=10)

def change():
    fname = entry.get()
    name = "Hiiiiiii " + fname + ". Im glad to meet you!"
    s_name = tkinter.Label(window,text=name).pack(pady=10)
    print(fname)

def new_func(name):
    f_name.__setattr__(text=name)


bt = tkinter.Button(text="Submit!", command=change).pack(pady=10)


window.mainloop()