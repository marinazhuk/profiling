# Operation Tree Profiling

* Implement Balanced Binary Search Tree class and operations of insert/delete/search
* Profile space usage ( Confirm that you see O (n) )
* Profile time consumption ( Confirm that you see O (log n))

### Testing

* IntelliJ Profiler was used

## Profile space usage
![memory_profiler.png](screenshots%2Fmemory_profiler.png)

| elements count | bytes   |
|----------------|---------|
| 10000          | 381024  |
| 20000          | 511512  |
| 30000          | 1046248 |
| 40000          | 1190360 |
| 50000          | 1570536 |
| 60000          | 2093672 |
| 70000          | 2616824 |
| 80000          | 2893768 |
| 90000          | 3152936 |
| 100000         | 3702712 |
![memory_chart.png](screenshots%2Fmemory_chart.png)
#### Conclusion
O (n)

## Profile Insert time consumption
![insert_profiler.png](screenshots%2Finsert_profiler.png)

| elements count | speed of insert of 100000 elements (ms) |
|----------------|-----------------------------------------|
| 1000000        | 80                                      |
| 2000000        | 110                                     |
| 3000000        | 90                                      |
| 4000000        | 100                                     |
| 5000000        | 100                                     |
| 6000000        | 90                                      |
| 7000000        | 100                                     |
| 8000000        | 140                                     |
| 9000000        | 110                                     |
| 10000000       | 130                                     |
![insert_chart.png](screenshots%2Finsert_chart.png)
## Profile Search time consumption
![search_profiler.png](screenshots%2Fsearch_profiler.png)

| elements count | speed of search of 100000 elements (ms) |
|----------------|-----------------------------------------|
| 1000000        | 52                                      |
| 2000000        | 42                                      |
| 3000000        | 83                                      |
| 4000000        | 83                                      |
| 5000000        | 62                                      |
| 6000000        | 52                                      |
| 7000000        | 93                                      |
| 8000000        | 83                                      |
| 9000000        | 62                                      |
| 10000000       | 62                                      |
![search_chart.png](screenshots%2Fsearch_chart.png)
## Profile Delete time consumption
![delete_profiler.png](screenshots%2Fdelete_profiler.png)

| elements count | speed of delete 100000 elements (ms) |
|----------------|--------------------------------------|
| 1000000        | 80                                   |
| 2000000        | 90                                   |
| 3000000        | 150                                  |
| 4000000        | 140                                  |
| 5000000        | 131                                  |
| 6000000        | 130                                  |
| 7000000        | 100                                  |
| 8000000        | 120                                  |
| 9000000        | 110                                  |
| 10000000       | 140                                  |
![delete_chart.png](screenshots%2Fdelete_chart.png)
### Conclusion
Diagrams of Insert, Search and Delete operations look like O(log n)