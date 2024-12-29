// Aditikrishna Mandula
// May 15 2024
// lab 8
//find the shortest path between two points
#include <iostream>
#include <algorithm>
#include <cmath>
#include <queue>
#define FOR(i, n) for(int i=0; i<n; i++)
using namespace std;
queue<int> unprocessed;
struct Graph
{
    int num_verts;
    int num_edges;
    int adj_matx [20][20];
};
struct Vertex_info
{
    int shortest;
    int predecessor;
    bool visited;
};
Vertex_info vertices[20];
void find_shortest_path (Graph gr, int start_vert, int end_vert)
{
    bool done = false;
    FOR(i, 20)
    {
        vertices[i].visited = false;
    }
    vertices[start_vert].visited = true;
    vertices[start_vert].shortest = 0;
    vertices[start_vert].predecessor = -1;
    unprocessed.push(start_vert);
    while (!done && !unprocessed.empty())
    { // front_vertex = front vertex in unprocessed_vertices (Also pop the front vertex from unprocessed_vertices)
        int front_vertex = unprocessed.front();
        unprocessed.pop();
        FOR(i, gr.num_verts)
        {
            if(gr.adj_matx[front_vertex][i] == 1)
            {
                int next_neighbor = i;
                vertices[next_neighbor]. visited = true;
                vertices[next_neighbor].shortest = 1 + vertices[front_vertex].shortest;
                vertices[next_neighbor].predecessor = front_vertex;
                unprocessed.push(next_neighbor);
                if(next_neighbor == end_vert) done = true;
            }
        }
    } 
}
void print_shortest_path(Graph gr, int start_vert, int end_vert)
{
    int shortest_path[20];
    FOR(i, 20)
    {
        shortest_path[i] = 0;
    }
    int from_posn = end_vert;
    int to_posn = vertices[end_vert].shortest;
    shortest_path [to_posn] = end_vert;
    while (from_posn != -1)
    {
        to_posn = to_posn - 1;
        shortest_path [to_posn] = vertices[from_posn].predecessor;
        from_posn = vertices[from_posn].predecessor;
    }
    int i = 0;
    while(shortest_path[i]!= 0)
    {
        cout<<shortest_path[i]<<endl;
        i++;
    }
}
void create_graph_p385_Fig8_2_1(Graph &gr)
{
    gr.num_verts = 7;
    gr.num_edges = 16;
    init_adj_matx(gr);
    add_edge(gr, 0, 1);
    add_edge(gr, 1, 0);
    add_edge(gr, 1, 2);
    add_edge(gr, 2, 1);
    add_edge(gr, 2, 3);
    add_edge(gr, 3, 2);
    add_edge(gr, 3, 1);
    add_edge(gr, 1, 3);
    add_edge(gr, 1, 4);
    add_edge(gr, 4, 1);
    add_edge(gr, 1, 5);
    add_edge(gr, 5, 1);
    add_edge(gr, 4, 5);
    add_edge(gr, 5, 4);
    add_edge(gr, 5, 6);
    add_edge(gr, 6, 5);
}
void create_graph_p381_Fig8_1_15(Graph &gr)
{
    gr.num_verts = 6;
    gr.num_edges = 16;
    add_edge(gr, 0, 2);
    add_edge(gr, 2, 0);
    add_edge(gr, 0, 3);
    add_edge(gr, 3, 0);
    add_edge(gr, 0, 4);
    add_edge(gr, 4, 0);
    add_edge(gr, 0, 5);
    add_edge(gr, 5, 0);
    add_edge(gr, 1, 2);
    add_edge(gr, 2, 1);
    add_edge(gr, 1, 3);
    add_edge(gr, 3, 1);
    add_edge(gr, 1, 4);
    add_edge(gr, 4, 1);
    add_edge(gr, 1, 5);
    add_edge(gr, 5, 1);
}
void create_graph_p394_number_4(Graph &gr)
{
    gr.num_verts = 9;
    gr.num_edges = 22;
    init_adj_matx(gr);
    add_edge(gr, 0, 1);
    add_edge(gr, 1, 0);
    add_edge(gr, 0, 5);
    add_edge(gr, 5, 0);
    add_edge(gr, 1, 2);
    add_edge(gr, 2, 1);
    add_edge(gr, 1, 6);
    add_edge(gr, 6, 1);
    add_edge(gr, 2, 3);
    add_edge(gr, 3, 2);
    add_edge(gr, 2, 7);
    add_edge(gr, 7, 2);
    add_edge(gr, 3, 6);
    add_edge(gr, 6, 3);
    add_edge(gr, 4, 7);
    add_edge(gr, 7, 4);
    add_edge(gr, 5, 6);
    add_edge(gr, 6, 5);
    add_edge(gr, 5, 8);
    add_edge(gr, 8, 5);
    add_edge(gr, 6, 8);
    add_edge(gr, 8, 6);
}
void add_edge(Graph &gr, int vertex1, int vertex2)
{
    gr.adj_matx[vertex1][vertex2] = 1;
}
void init_adj_matx(Graph &gr)
{
    for (int row=0; row< gr.num_verts; row++)
        for (int col=0; col< gr.num_verts; col++)
            gr.adj_matx [row] [col] = 0;
}
void print(Graph &gr)
{
    for (int row=0; row< gr.num_verts; row++)
    {
        for (int col=0; col< gr.num_verts; col++)
            cout << gr.adj_matx [row] [col] << " ";
            cout << endl;
    }
}
void create_and_print_incidence_matrix (Graph gr)
{
    int array[gr.num_verts][gr.num_edges];
    int counter = 0;
    for (int row=0; row< gr.num_verts; row++)
        for (int col=0; col< gr.num_verts; col++)
            array[row][col] = 0;
    FOR(col, gr.num_verts)
    {
        FOR(row, gr.num_verts)
        {
            if(gr.adj_matx[row][col] == 1)
            {
                array[row][counter] = 1;
                array[col][counter] = 1;
                counter++;
            }
        }
    }
    for (int row=0; row< gr.num_verts; row++)
    {
        for (int col=0; col< gr.num_verts; col++)
        {
            cout<<array[row][col]<<" ";
        }
        cout<<endl;
    }
}
void print_edge_list(Graph gr)
{
    int counter = 0;
    FOR(col, gr.num_verts)
    {
        FOR(row, gr.num_verts)
        {
            if(gr.adj_matx[row][col] == 1)
            {
                cout<<"Edge "<<counter<<": "<<row<<" to "<< col <<endl;
            }
        }
    }
}
int main()
{
    Graph gr;
    create_graph_p385_Fig8_2_1(gr);
    print(gr);
    create_and_print_incidence_matrix (gr);
    print_edge_list(gr);
    create_graph_p385_Fig8_2_1(gr);
    print(gr);
    create_and_print_incidence_matrix (gr);
    print_edge_list(gr);
    create_graph_p394_number_4(gr);
    print(gr);
    create_and_print_incidence_matrix (gr);
    print_edge_list(gr);

    
}