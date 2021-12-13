fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

print(fruit_shop)
key_to_check = input("What are you looking for? ").lower()

for fruit in fruit_shop:
    if(fruit==key_to_check):
        print("Yes, this is available")
        break
else:
    print("No, this is not available")