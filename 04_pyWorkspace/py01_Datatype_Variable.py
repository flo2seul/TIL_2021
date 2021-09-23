#!/usr/bin/env python
# coding: utf-8

# ### 변수와 데이터 타입
#     파이썬에서의 데이터 타입
#     
#     int = 정수
#     float = 상수
#     bool = False, True
#     str = 문자열
#     list = 리스트, 순서가 있는 값들의 집합 []. 값은 변경가능
#     tuple = 튜플, 순서가 있는 값들의 집합 (), 값은 변경 불가
#     set = 순서없고, 중복 안되는 값들의 집합 {}
#     dic = 키와 값이 쌍으로 저장되는 값들의 집합 {'key' :value}

# In[1]:


a = 3
b = 3.5
c = "Hello"
d = 'Hello'

print(a)
print(b)
print(c)
print(d)

print('*'+'*') #문자열 + : 더해진다
print('*'* 30)

#값들의 타입을 출력...type() 함수를 이용
print(type(a))
print(type(b))
print(type(c))
print(type(d))


# In[2]:


e = 3
f = 3.0
print(e == f)
print(type(e) == type(f))


# ## 실행시 값을 입력받는 input()

# In[3]:


#input() 로 입력된 값은 타입이 무조건 문자열이다.
data = input('값입력')
print('입력된 값 :: ',data)
print(type(data))


# ### 연산자와 포맷팅
# 

# In[4]:


num1 = 5
num2 = 3
print(num1 / num2)#float로 반환
print(num1 // num2)#나눈 몫을 구함..나머지는 버린다.
remain = num1 % num2
print(remain)

'''
파이썬의 모든 변수는 객체로 취급된다.
그렇게 때문에 당연히 메소드가 있다.
'''
dir(num1)


# In[5]:


int(True)
int(False)
int(e)
float(a)
round(44.76)
int('111')


# In[6]:


name = 'James'
age = 40
print(name,'의 나이는',age, '세 입니다.')


# ### 문제1
#     키보드로 초를 입력받아서 다음과 같이 출력합니다.
#     입력받는 초 --- ex 3700
#     출력방식 --- 3700초는 1시간 1분 40초입니다.

# In[7]:


a = int(input('초를 입력하세요: '))
hour = a//3600
minute = (a-3600)//60
second = (a-3600)%60
#print(a,'초는',hour,'시간',minute,'분',second,'초 입니다')
print('%d초는 %d 시간 %d 분 %d 초입니다.'%(a,hour,minute,second))


# In[8]:


'''
아래에 출력되는 것들은 파이썬 파일을 만들어서 사용하는 순간
메모리에 무조건 올라가는 것들이다.
내장 함수들...
내장함수명이 변수명으로 사용되지 않도록 주의
first(), int(), input(), max()...가 대표적인 내장함수들이다.
'''
dir(__builtin__)


# In[9]:


'''
숫자(int, float), str, Tuple 타입은 Immutable 객체이다.
데이터가 변경되는 순간 새로운 객체가 생성된다.
기존의 데이터를 변경하는 것은 불가능하다.
'''
a = 257
b = 257
print(a==b)
print(a is b)

print(id(a))
print(id(b))


# In[10]:


'''
-5 ~ 256 사이의 값들은
메모리를 효율적으로 사용하기 위해서
이 범위에 있는 값들은 한번만 객체를 만들고나서 다시 만들지 않는다.

'''
a = 200
b = 200

# 값 비교
print(a==b)
# 객체 비교
print(a is b)


# In[11]:


mystr1 = 'hello'
mystr2 = 'hello'

#여러줄의 문자열을 표시할 때
mystr3 = '''This is
           Mystr3 test
           hello'''
print(mystr1)
print(mystr2)
print(mystr3)


# In[12]:


name = '손흥민'
age = 29
grade = 4.789

#포맷팅 처리해서 출력하기
print('%s의 나이는 %d, 이번 경기 평점은 %0.2f입니다.' %(name,age,grade))

#포맷팅2
import time
now=time.localtime()

print('현재 시간은 %d년 %d월 %d일 입니다.' %(now.tm_year,now.tm_mon,now.tm_mday))

