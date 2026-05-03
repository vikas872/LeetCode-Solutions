from collections import deque
class MyStack:

    def __init__(self):
      self.iq = deque()
      self.oq = deque()

    def push(self, x: int) -> None:
        self.iq.append(x)

    def pop(self) -> int:
        x = len(self.iq)
        for i in range(0,x-1):
            self.oq.append(self.iq.popleft())
        res = self.iq.popleft()
        self.iq,self.oq = self.oq,self.iq
        return res
    def top(self) -> int:
        x = len(self.iq)
        for i in range(0,x-1):
            self.oq.append(self.iq.popleft())
        res = self.iq.popleft()
        self.oq.append(res)
        self.iq,self.oq = self.oq,self.iq
        
        return res
        

    def empty(self) -> bool:
        return not self.iq and not self.oq
        


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()