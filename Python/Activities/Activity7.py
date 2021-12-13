
numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
sum = 0

for n in numbers:
  sum =sum+int(n)

print('Total sum :',sum)