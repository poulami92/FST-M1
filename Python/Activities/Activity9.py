	
# Given lists
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]
 
# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

newList=[]

for n in listOne:
    if(n%2!=0):
        newList.append(n)

for n in listTwo:
    if(n%2==0):
        newList.append(n)

print('new List :',newList)