#python program to chec if the given number is armstrong number or not armstrong
#take input from user
num=int(input("enter a number:")
sum = 0
temp = num
while temp > 0:
    digit = temp % 10
    sum += digit**3
    temp//=10
#display the result
if num == sum:
    print(num,"is armstrong number")
else:
    print(num,"is not an armstrong number")

