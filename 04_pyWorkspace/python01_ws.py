#!/usr/bin/env python
# coding: utf-8

# # 1. 자료형
# ## Background
# - 데이터 타입
# - 제어문
# 
# ## Problem
# ### 1. myList = `[[1,2,3],[4,5,6],[7,8]]`에 9를 추가하여 `[[1,2,3],[4,5,6],[7,8,9]]`가 되도록 구현해보세요
# - append와 insert 두가지 방법으로 풀어보세요

# In[1]:


myList = [[1,2,3],[4,5,6],[7,8]]
#myList[2].append(9)
myList[2].insert(2, 9)
print(myList)


# ### 2. Dictionary를 활용해서 학생들의 이름과 점수를 key와 value로 입력하고 추가, 삭제, 업데이트를 진행해보세요.
# 1. score라는 dictionary에 하준 90점, 서윤 86점, 지아 80점을 입력하세요.
# 2. score에 수지 95점을 추가하세요.
# 3. score에서 지아를 삭제하세요.
# 4. score에 기창 98점, 남철 60점, 기성 75점을 <u>한번에</u> 추가해보세요

# In[2]:


score = {'하준':90,'서윤':86,'지아':80}
score['수지'] = 95
del score ['지아']
addinfo = {'기창':98,'남철':60,'기성':75}
score.update(addinfo)
score


# ### 3. 다음 리스트에서 중복된 항목을 없애보세요.
# ```python
# myList = [1,3,2,3,7,6,8,4,10,5,3,8,9]```

# In[3]:


myList = [1,3,2,3,7,6,8,4,10,5,3,8,9]
print(set(myList))


# ### 4. 다음의 세 문장에서 중복으로 사용된 알파벳만 출력해보세요.(대소문자 구분)
# - "Hello python"
# - "Funny programming"
# - "Happy newyear"

# In[7]:


set("Hellopython")&set("Funnyprogramming")&set("Happynewyear")


# ### 5. 다음과 같은 규칙을 가진 숫자의 합을 for문을 사용해서 구현하세요.
# - 1 + (1 + 3) + (1 + 3 + 5) + (1 + 3 + 5 + 7) + ... + (1 + 3 + ... + 19)

# In[34]:


# 첫번쨰 풀이
a = [1,3,5,7,9,11,13,15,17,19]
b = []
c = 0
for i in a:
    if i == 1:
        c = i
        b.append(c)
    else:
        c = c+i
        b.append(c)
print(sum(b))
#두번째 풀이
total = 0
for i in range(1,11):
    subtotal = 0
    for j in range(i):
        subtotal += 2*j+1
    total += subtotal
print(total)

