from collections import Counter
#enter the numbe of shoes
X = int(input())
#enter shoe sizes and use collectins counter
S = Counter(map(int,input().split()))
#customer number
N = int(input())
#initialize variable to store earning
earnings = 0
#use customer number in loop 
for i in range(N):
  #get size and price from user
    size, price = map(int, input().split())
    #check user entry in S collection
    if size in S and S[size] > 0:
      #reduce the number of size
        S[size] -= 1
        #add the price to earning to calculate final value
        earnings += price
#print final value            
print(earnings) 
