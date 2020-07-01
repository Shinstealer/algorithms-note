# 큐[QUEUE]의개념
Queue is an abstract data structure, somewhat similar to Stacks. <br>
Unlike stacks, a queue is open at both its ends. One end is always used to insert data (enqueue) and the other is used to remove data (dequeue). <br>
Queue follows First-In-First-Out methodology, i.e., the data item stored first will be accessed first.
* First In First Out
# Basic Operation
Queue operations may involve initializing or defining the queue, utilizing it, and then completely erasing it from the memory. Here we shall try to understand the basic operations associated with queues −

* enqueue() − add (store) an item to the queue.
* dequeue() − remove (access) an item from the queue.

Few more functions are required to make the above-mentioned queue operation efficient. These are −

* peek() − Gets the element at the front of the queue without removing it.
* isfull() − Checks if the queue is full.[Boolean]
* isempty() − Checks if the queue is empty.[Boolean]

# 큐의사용 예
* 너비 우선 탐색(BFS, Breadth-First Search) 구현<br>
  처리해야 할 노드의 리스트를 저장하는 용도로 큐(Queue)를 사용한다.<br>
  노드를 하나 처리할 때마다 해당 노드와 인접한 노드들을 큐에 다시 저장한다.<br>
  노드를 접근한 순서대로 처리할 수 있다.<br>
* 캐시(Cache) 구현
* 우선순위가 같은 작업 예약 (인쇄 대기열)
* 선입선출이 필요한 대기열 (티켓 카운터)
* 콜센터 고객 대기시간
* 프린터의 출력 처리
* 윈도 시스템의 메시지 처리기
* 프로세스 관리

# Reference
* https://www.tutorialspoint.com/data_structures_algorithms/dsa_queue.htm
* https://gmlwjd9405.github.io/2018/08/02/data-structure-queue.html
