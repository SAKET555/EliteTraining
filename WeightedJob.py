# Weighted Job Scheduling ---- Recursive
def maxprofitRec(i, jobs):
    if i >= len(jobs):
        return 0
        
    # Option 1: Skip the current job
    skip = maxprofitRec(i + 1, jobs)
    
    # Option 2: Take the current job
    next_idx = i + 1
    # Find the next job that doesn't overlap (starts after current ends)
    while next_idx < len(jobs) and jobs[next_idx][0] < jobs[i][1]:
        next_idx += 1
    
    take = jobs[i][2] + maxprofitRec(next_idx, jobs)
    
    return max(take, skip)

def maxprofit(jobs):
    jobs.sort() # Sort jobs by start time
    return maxprofitRec(0, jobs)

n = int(input("Enter number of jobs: "))
jobs = []
print("Enter job details (start, end, profit):")
for i in range(n):
    st, en, pr = map(int, input().split())
    jobs.append([st, en, pr])
print("Max Profit:", maxprofit(jobs))
