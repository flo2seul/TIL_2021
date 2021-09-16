#!/usr/bin/env python
# coding: utf-8

# ### 함수

# #### 머신, 딥러닝 코드를 다루다 보면 함수 정의 부분이 중요하다
#     1.함수 정의 기본 문법
#     def 함수이름(매개변수):
#      수행할 문장1
#      수행할 문장2
#     2. 함수를 만드는 방법 4가지
#       1)위치매개변수
#       2)기본매개변수
#       3)키워드매개변수
#       4)가변매개변수

# In[1]:


# 1. 위치매개변수
# 가장 기본적인 인자값 전달방식, 함수에서 정의한 위치대로 인자값이 할당됨
def calc(num1, num2):
    '''
    인자값으로 받은 num1, num2
    2개의 값을 더해서 result 로컬변수에 할당
    그 값을 리턴하는 기능을 구현
    '''
    
    result = num1+num2
    return result

print(calc(3,5))


# In[3]:


#리턴값이 없는 경우
def add(a,b):
    print('%d와 %d의 합은 %d입니다.' %(a,b,(a+b)))
    '''
    return문 자체가 없으면 함수는 None 객체를 리턴한다.
    '''
add(3,4)


# In[8]:


#2. 기본매개변수
# 변수값을 입력하지 않으면 기본값이 활성화됨.

def calc1(end, start = 0):
    total = 0
    for i in range(start, end):
        total += i
    return total
print(calc1(5,1))
print(calc1(5))#에러나지 않는다...기본값이 활성화되어져 돌아간다.


# In[ ]:


#실제로 기본매개변수 사용이 많이 있다.
import pandas as pd
from pandas import DataFrame


# In[1]:


#3. 키워드 매개변수: 순서에 상관없이 직접 매개변수를 지정해서 전달한다.
#주의할 점은 함수 호출시에 매개변수명을 정확히 알아야 한다.
def calc2(name,age):
    print('나의 이름은',name,'이고 나이는',age,'입니다.')
calc2('홍길동',19) #위치매개변수

calc2(30,'홍길동')# 에러는 안나고 단기 잘못된 값이 전달된다.
calc2(age = 30, name = '홍길동')#키워드 매개변수


# In[2]:


#키워드 매개변수 사용 예
import numpy as np
import pandas as pd
from pandas import DataFrame
df1=DataFrame(np.random.randn(4,4),
             columns=list('efgh'),
             index=list('abcd')
             
             )
df1


# In[3]:


#4. 가변 매개변수 : 인자값이 몇개인지 모르는 상황에서 사용
# 파이썬에서 print() 함수가 대표적이다. 원하는 만큼의 인자값을 받을 수 있도록 작성
#일반 매개변수와 다르게 변수명 앞에 *를 붙임
#역시 가변배개변수 뒤에 일반매개변수가 뒤에 올 수 없다.
#가변 매개변수는 하나만 사용해야한다.

def calc3(*args):
    print(args)
    
calc3(3)
calc3(3,4,5,6) #출력은 튜플 타입으로 된다.


# In[4]:


#5.
def calc4(**args):
    print(args)
    
#calc4(1,2) 에러난다.

'''
**이 2개일때는 반드시
인자값 입력시 주의를 요한다.
딕셔너리 타입!!
'''

calc4(name='James',age=44, address="NY")


# In[5]:


#일반 매개변수와 가변매개변수를 함께 사용하는 경우
def calc5(name, *args):
    print(name, ':',args)
calc5('James',3,4,5)

# +@
def say_hello(name, age):
        return f"hello {name} you are {age} years"
hello = say_hello('avery', '25')
print(hello)
