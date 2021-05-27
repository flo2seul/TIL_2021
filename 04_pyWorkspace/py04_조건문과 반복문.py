#!/usr/bin/env python
# coding: utf-8

# ### 조건문, 제어문(if, elif, else)

# In[2]:


a = 3
if a % 2 ==0:
    print('EVEN...')
else:
    if a==1:
        print('a is 1...')
        
    elif a==3:
        print('a is 3...')


# In[8]:


grade = int(input('성적입력>>>'))
#print(type(grade))

if grade >= 90:
    print('A grade')
elif grade >=80 and grade<90:
    '''
    이 부분도 tab 키에 맞춰서 작성되어져야 함
    '''
    print('B grade')
elif grade >= 70 and grade<80:
    print('C grade')
else: 
    print('Nuts')


# ### 반복문(for, while)

# In[12]:


movie_list = ['미나리','조커','경계선','스타워즈']

#1. for
for movie in movie_list:
    print(movie)
    
print('*'*40)

#2. range() 함수
for idx in range(len(movie_list)):
    print(movie_list[idx])


# ### 문제 1.
#     키보드로 값들을 입력받습니다.
#     입력받은 값의 전체의 합을 구하는 로직을 작성.
#     ex) 3,4,5,6 입력받은 값 세팅

# In[22]:


data = input('키보드로 정수값을 입력하세요: ').split(',')
total = 0

#1.
#for i in data:
#    total += int(i)
#print('총합 : ', total)

#2. range() 함수 사용
#for i in range(len(data)):
#    total += int(data[i])
#print('총합 :', total)

#3.
inData = [int(i) for i in data]
print(type(inData))
print(sum(inData))


# ### 문제 2.
#     numList = [5,10,11,3,2,100]으로 주어집니다.
#     
#     numList 리스트 자료형을 이용해서 아래와 같은 결과가 출력되도록 코드를 작성하세요
#     ['홀','짝','홀','홀','짝','짝']

# In[28]:


#1. 
numList = [5,10,11,3,2,100]
choice = []

for i in range(len(numList)):
    if int(numList[i])%2 == 0:
       choice.append('짝')
    else:
        choice.append('홀')
print(choice)


# In[30]:


#2.
numList = [5,10,11,3,2,100]

resultList = ['짝' if i % 2 == 0 else '홀' for i in numList]
print(resultList)


# ### 이차원 배열에 for 사용하기, 이중 for문

# In[35]:


for i in range(5): #range(0,5) 동일
    print(i, '\t',end = '')


# In[37]:


matrix = [[1,2,3],[4,5,6],[7,8,9,10]]
print(len(matrix))
print(matrix)


# ### 문제 3.
#     [1,2,3]
#     [4,5,6]
#     [7,8,9,10]
#     위와 같은 패턴으로 출력되도록 for문을 사용한다.

# In[47]:


#1. for문 사용
for i in matrix:
    print(i)
print('*'*30)

#2. range() 사용
for i in range(len(matrix)):
    print(matrix[i])
print('*'*30)

#3. 이중 for문 사용
for i in range(len(matrix)):
    for j in matrix[i]:
        print(j, '\t', end='')
    print()
print('*'*30)

#4.
for row in matrix:
    for col in row:
        print(col, '\t', end='')
    print()


# ### While문
#     1부터 100까지의 합을 구하자
#     조건을 2가지 방식으로 지정
#     1) while i < 101:    2) while True:

# In[50]:


#1)
i = 1
total1 = 0

while i < 101:
    total1 += i
    i = i+1
print('100 까지의 총합은', total1)
print('*'*30)

#2)
j =1
total2=0
while True:
    if j==101:
        break
    total2 += j
    j = j+1
print('100 까지의 총합은', total2)

    


# ### break, continue, pass 키워드

# In[51]:


for i in range(10):
    if i==2:
        print('continue...loop')
        continue
    if i==6:
        print('breaking..loop')
        break
    if i==4:
        pass
    print(i)

