numbers = list(input("Enter comma separated values: ").split(","))
sum = 0

for number in numbers:
  sum = sum + int(number)
print(sum)