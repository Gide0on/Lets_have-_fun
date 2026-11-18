def temperature_conterter(int, str):
    celcius = 100
    if celcius < -273:
          print("Impossible!")
    fahrenheit = (celcius * 9/5)+ 32

    print(fahrenheit, "F")
    
    fahrenheit = 100
    if fahrenheit < -273:
        print("Impossible!")
    celcius = (fahrenheit - 32)* 5/9
    print(celcius, "C")
    
temperature_conterter()
