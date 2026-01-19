def add_edge(adj, u, v):
    adj[u].append(v)
    adj[v].append(u)
def display(adj):
    for vertex in range(len(adj)):
        neighbors = "->".join(map(str, adj[vertex]))
        print(f"{vertex} : {neighbors}")

v_cnt = int(input("Vertices: "))
adj = [[] for i in range(v_cnt)]
edj = int(input("Edges: "))
for i in range(edj):
    print(f"Edge {i+1}: ", end="")
    u=int(input("Source: "))
    v=int(input("Destination: "))
    if 0<= u < v_cnt and 0<= v < v_cnt:
        add_edge(adj, u, v)
#not my code 