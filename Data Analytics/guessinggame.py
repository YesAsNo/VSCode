done = False
matched = False
correct = "Katherine"
tries = 0

while done == False:
    print("Guess my name!")
    userinput = input()
    print("You guessed", userinput)
    tries = tries + 1
    matched = userinput == correct

    if matched:
        print("Congratulations!!! It took you", tries, "tries!")
        done = True
    elif not matched and tries < len(correct):
        print("Incorrect, currently at", tries, "tries.")
        print("Hint:", correct[:tries])
        print("give up? y/n")
        userinput = input()

        if userinput == "y":
            print("Correct name was", correct)
            done = True
    else:
        print("The name is", correct,"silly!")
        done = True
