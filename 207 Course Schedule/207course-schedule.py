class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        from collections import defaultdict, deque
        graph = defaultdict(list)
        indegree = [0] * numCourses
        for course, prereq in prerequisites:
            graph[prereq].append(course)
            indegree[course] += 1
        queue = deque([i for i in range(numCourses) if indegree[i] == 0])
        count = 0
        while queue:
            course = queue.popleft()
            count += 1
            for neighbor in graph[course]:
                indegree[neighbor] -= 1
                if indegree[neighbor] == 0:
                    queue.append(neighbor)
        return count == numCourses
