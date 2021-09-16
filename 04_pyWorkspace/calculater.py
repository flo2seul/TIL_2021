def plus(a, b):
    if type(a or b) is str:
        return None
    else:
        return a+b

def minus(a, b):
    return a-b

def multiply(a,b):
    return a*b

def division(a, b):
    return a/b

def share(a,b):
    return a//b

def remainder(a,b):
    return a%b

def power(a,b):
    return a**b

plus = plus("5", 9)
print(plus)