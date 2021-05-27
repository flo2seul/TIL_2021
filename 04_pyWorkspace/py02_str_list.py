#!/usr/bin/env python
# coding: utf-8

# ### 문자열
#     인덱싱과 슬라이싱

# In[9]:


mystr = '20210510Cloudy'

# 인덱스와 슬라이싱을 이용해서 날짜와 날씨를 각각 할당하세요.
mydate = mystr[0:8]
print(mydate)
weather = mystr[-6:]
print(weather)

all = mystr[:]
print(all)


# In[16]:


movies = '미나리, 경계선, 기생충, 매트릭스'
print(movies)
moviesL = movies.split(",")
print(moviesL)

#join()은 str에 적용되는 함수
#구분자.join(리스트)
# movie = ''
movie = ''.join(moviesL)
print(movie)


# ## 리스트 생성, 추가, 삭제, 수정

# #### 1. 리스트 생성하기

# In[21]:


mylist1 = [2,5,3,10,4]
mylist2 = []
mylist3 = list()

print(mylist1)
print(mylist2)
print(mylist3)

len(mylist1)
len(mylist2)

mylist3.extend(mylist1) #확장됨
mylist3


# #### 2. 리스트 수정하기

# In[24]:


mylist1[3] = -10
mylist1 #값 변경 가능


# #### 3.리스트 추가하기
#     - append()
#     - insert()

# In[27]:


get_ipython().run_line_magic('pinfo', 'mylist1.append')
get_ipython().run_line_magic('pinfo', 'mylist1.insert')


# In[29]:


mylist1


# In[34]:


mylist1.append(100)
mylist1


# In[36]:


mylist1.insert(3,200)
mylist1


# In[40]:


# 리스트 가장 마지막에 -200을 추가...insert()를 사용...마지막을 의미하는 인덱스를 적용
mylist1.insert(-1,-200)
mylist1


# In[53]:



mylist1.remove(-200)
mylist1


# In[55]:


#리스트 가장 마지막에 -200을 추가..append 사용하지 말고
mylist1.insert(len(mylist1),-200)#마지막 인덱스가 len() -1
mylist1


# ### 4. 리스트 삭제하기
#     del : 인덱스로 삭제하기
#     remove : 삭제할 값 직접 입력
#     pop : 맨 마지막 값을 삭제한 후 리턴함

# In[68]:


mylist = [1,2,3,4,4,5]
del mylist[2]

del mylist[0:2]
mylist

mylist.remove(4)
a = mylist.pop()
a

mylist


# ### 5.리스트에서 값 추출하기 | 정렬하기 sort()

# In[73]:


myL = [1,2,3,4,5,6,7,8]
print(myL[1:3])#[2,3]
print(myL[:3])#[1,2,3]
print(myL[4:])#[5,6,7,8]
print(myL[-3:])#[6,7,8]

myL.sort(reverse=True)
myL


# ### 문제 1.
#     100, 200,[10,20,30], 300, 400, 500으로 리스트를 변경하세요.

# In[78]:


a = [100,200,300,400,500]
b = [10, 20, 30]
#a [2] = b
#a[2:3] = b
a.insert(2,b)
a


# In[106]:


'''
파이썬에서 모든 변수는 객체이다.
who옵션을 사용하면 지금까지 사용한 객체변수명을 출력
동시에 간단한 정보도 확인

%who
%whos - 변수명 뿐만 아니라 변수값도 함께 출력
'''
get_ipython().run_line_magic('whos', '')


# In[1]:


'''
list0 내장함수와 
list 전역변수의 이름이 동일하고 사용된 경우

이렇게 동일한 이름의 변수 선언시
메모리에서 찾는 순서
1) 로컬변수는 로컬영역에 저장 --- 여기를 가장 먼저 뒤진다.
2) 전역변수는 전역영역에 저장 --- 여기를 2번째로 뒤진다.
3) 내장변수는 내장영역에 저장 --- 여기를 가장 마지막으로 찾는다

-->
아래에서 전역변수 부분을 먼저 찾아서 돌려놓고
그런 다음에 내장변수를 찾았더니...이미 위에서 사용된 이름이라서
내장변수에서 에러가 난다.

RESTART를 해서 메모리를 싹 지워버리고
새롭게 다른 이름으로 할당
'''
aList = list('abcd')
aList

list_data = [3,4,5]
print(list_data)
list_data.sort(reverse=True)#내림차순
list_data
print(5 in list_data)


# ### 6. 2차원 배열에서 데이터 추출하기

# In[90]:


test20 = [[1,3],[4,6]]
print(test20)
print(test20[1][1])


# In[92]:


myLang = [['hello','phython'],['good-bye','c']]
myLang


# In[104]:


print(myLang[1][0][0:4])
print(myLang[1][0][:4])
print(myLang[1][0].split('-')[0])


# In[ ]:




