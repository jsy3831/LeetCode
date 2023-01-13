<h2>ConcurrentModificationException</h2>

- Multi threads 환경에서 또는 객체의 변경이 허용되지 않는 환경에서 concurrent modification이 일어날 때 이 예외가 발생할 수 있다. 예를 들면 한 스레드가 Collection을 Iterating 하고 있을 때 다른 스레드에서 Collection을 modify 하는 경우이다.
- <b>그러나 싱글 스레드 환경에서도 Collection을 fail-fast iterator하고 있을 때 Collection을 modify 하는 걸 허용하지 않는다.</b>

<h2>fail-fast iterator</h2>

- Iterator의 remove() 메소드 이외의 코드로 기존 Collection이 수정되면 Fail-fast iterators는 예외가 발생한다.
- Collection은 modCount라는 내부 카운터를 유지하는데 Collection에서 항목을 추가하거나 제거 할 때마다 이 카운터가 증가한다.
- 반복 할 때 각 next() 호출에서 modCount의 현재 값이 초기 값과 비교되고 불일치가 있으면 전체 작업을 중단시키는 ConcurrentModificationException이 발생한다.
- ArrayList, HashMap 등과 같은 java.util 패키지의 컬렉션에 대한 기본 반복자는 Fail-Fast이다.
