import math
def mt(a,b,c):
    return max(a,b,c)
def sn(l):
    return sum(l)
def mn(l):
    p=1
    for i in l:
        p*=i
    return p
def rs(s):
    return s[::-1]
def fact(n):
    return math.factorial(n)
def cr(a,b,c):
    if(a<=c and c<=b):
        return True
def en(l):
    for i in l:
        if(i%2==0):
            print(i)

print(mt(2,5,4))
print(mn([1,2,5,7]))
print(sn([2,3,1,5]))
print(rs("pramod"))
print(fact(6))
print(cr(3,8,4))
en([2,4,7,6,8,9,11])
