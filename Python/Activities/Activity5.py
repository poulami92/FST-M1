number = int(input("Input a number: "))

for i in range(1,11):
   #print(number, ' x ', i, ' = ', number*i)
   result=number*i
   stmt='{} x {} = {}'
   print(stmt.format(number,i,result))
