#!/usr/bin/env python
# coding: utf-8

# ### Tuple - 데이터 조작이 불가능 Immutable
#     튜플은 몇가지 점을 제외하곤 거의 리스트와 비슷
#     다른점은
#     - 리스트는 []값을 둘러싸지만 튜플은 ()를 사용한다.
#     - 리스트는 값을 추가, 삭제, 수정..즉 변경이 가능하지만
#       튜플은 한번 생성된 값을 수정할 수 없다.
#       
#     - 만약에 튜플로 만들어진 값을 조작하고 싶다면
#       리스트로 형을 변환시킨 다음에 변경할 수 있다. list(t)

# ### 1. 튜플 생성하기

# In[1]:


t1 = (1,2,3,4)
t2 = (4,5,6)
t1
t2

#중요
t3 = (1) #값이 한 개일때...
t4 = (1.)
print(type(t3))
print(type(t4))


# #### 튜플을 사용하는 경우
#     프로그램이 실행되는 동안 그 값이 항상 변경되지 않기를 바란다거나
#     값이 바뀔까봐 걱정하고 싶지 않다며 무조건 튜플을 사용
#     이와는 반대로 수시로 그 값을 변경시켜야 하는 경우라면 리스트를 필히 사용하자
#     

# In[2]:


a, b, c = 3,4,5
print(type(a))

a = 3,4,5 # () 생략됨
print(type(a))


# In[3]:


t = (1,2,3,4,5,6,7,8,9,0,100)

tList = list(t)
tList


# In[4]:


'''
len() 컨테이너에 포함된 데이터 항목의 갯수를 리턴
컨테이너란 튜플, 딕셔너리, 리스트, 셋

값들의 수정이 불필요한 경우라면, 리스트보다는 튜플을 이용하는 것이 효율적
메모리 사용이 훨씬 적다.
sys.getsizeof() - 특정 개체의 메모리  사이즈를 바이트 단위로 반환
직접 메모리 용량을 손쉽게 확인 가능

'''
import sys
print(len(t))
print(len(tList))
print('튜플',sys.getsizeof(t))
print('튜플',sys.getsizeof(tList))


# #### 2. 튜플값 삭제 및 변경

# In[5]:


t[3] = 77
# t 에러난다...


# ### 딕셔너리
#    
# #### 1.생성하기

# In[ ]:


pro_dic = {'name':"DRAM", 'capa':'32g','maker':'SK','price':320000}
pro_dic


# ### 2. 데이터 조회하기
#     1) [key]      2)get(key)

# In[ ]:


# 딕셔너리 데이터를 조회할 때는 리스트, 튜플과 달리 
print(pro_dic['name'])
print(pro_dic.get('name'))


# ### 3. 데이터 수정하기

# In[ ]:


pro_dic['price'] = 230000
pro_dic


# In[ ]:


#데이터 추가하기
addInfo={'loc':'이천','pop':33}
pro_dic.update(addInfo)
pro_dic


# #### 4. 데이터 삭제하기
#     del pro_dic[key]

# In[ ]:


del pro_dic['pop']

#del pro_dic[3] 인덱스 접근이 안된다.
pro_dic


# #### 딕셔너리를 다룰 때 주의할 사항
#     1) 키값은 중복될 수 없다. 만약에 키가 중복되면 마지막 값으로 덮어 씌어진다.
#     2) 키값으로는 리스트 사용못함 -- 튜플은 가능
#     3) key-value -- 없는 key를 입력할 때 서로 다른 결과

# In[ ]:


#a = {[1,2,3]:'hi'}
#a

b = {(1,2,3):'hello'}


# #### 딕셔너리 함수 사용하기
#     keys() | values()
#    

# In[ ]:


dic = {'name':'peter','age':34, 'address':'Texas','phone':'1201234'}
dic


# In[ ]:


# dic 의 키값만 뽑아서 출력
dic_keys = dic.keys()
print(dic_keys)
print(type(dic_keys))

# 키들의 목록을 리스트로 변환시켜서 출력
print(list(dic_keys))
'''
dict_keys 객체는 리스트를 사용하는 것과 별반 다르지 않지만
리스트 고유의 기능...append, insert, pop, remove...sort 함수를 적용할 수 없다.
필요하면 list로 변환 시켜놓고 함수 적용해야 한다.
'''
#값들의 목록을 받아보자
dic_values = dic.values()
print(dic_values)
print(type(dic_values)) #dict_values 객체로 반환

# key, value 모두 얻기
dic_items = dic.items()
print(dic_items)
print(type(dic_items))


# In[ ]:


###
dic

name1 = dic.get('aaa')
print(name1) #존재하지 않는 키를 입력하면 None 리턴

name2 = dic.get('bbb')
print(name2) #존재하지 않는 키를 입력하면 에러 리턴

'bbb' in dic
'name' in dic


# ### SET
#     중복을 허용하지 않는다
#     순서가 없다
#     
#     순서가 없기 때문에 인덱싱을 통해서 자료를 조회할 수 없다
#     인덱싱을 사용하려면 리스트, 튜플 자료형으로 변환할 수 사용할 수 있다.
#     list(), tuple() 변환함수 사용
#     
#     중복을 허용하지 않는 SET 특징은 자료형의 중복을 제거하기 위한 필터 역할로 종종  사용된다.
#     [1,1,2,2,2,3,5,6,6] -> set( [1,1,2,2,2,3,5,6,6])

# In[ ]:


my_set = {'a','b','c','a','b'}
my_set


# In[ ]:


#중복을 벗겨내는 필터링 역할
a = [1,2,2,3,4,5,5,6,7,8,2,1]
print(a)

set_a = set(a)
print(set_a)
list_a = list(set_a)
print(list_a)


# In[ ]:


#sort 리턴타입이 None이다.
list_sort = list_a.sort(reverse=True)
#print(list_sort)

print(sorted(list_a, reverse=True))


# ### SET 관련 함수
#     add() ;추가  |  update() ;여러개 추가 | remove()

# In[ ]:


#1. 하나의 값 추가하기...add()
s1 = set([1,2,3])
s1.add(5)
s1


# In[ ]:


#2. 값 여러개 추가하기...update
s2 = {4,5,6,7}
s1.update(s2)
s1


# In[ ]:


s1.update(3) #update() 로 값을 하나 추가하면 에러..add 사용
s1


# In[ ]:


# 값 제거하기...remove()
s1.remove(1)
s1

