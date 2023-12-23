# 코드 설명

- 행과 열이 9로 같으므로 상수 RANGE_MATRIX 선언
- Scanner 클래스의 인스턴스 생성 및 참조 변수 sc 에 할당
- 최대값, 최대값의 행열 인덱스 추적 변수 (trackerMax / idxRowMax / idxColMax) 선언
- 2중 for 문으로 RANGE_MATRIX * RANGE_MATRIX 번 만큼 순회 (행부터 수행)
- 각 시행마다 정수 값을 입력받고 trackerMax 에 저장 (trackerMax 의 초기값이 -1 이므로 Math.max 메서드로 저장하면 자동으로 최대값이 계산됨)
- 현재 시행이 최대값인 경우, 현재 시행의 행과 열을 idxRowMax, idxColMax 변수에 저장

> 최종적으로 trackerMax 와 idxRowMax 와 idxColMax 의 값이 할당이 되었을 때, 그 값들을 출력
> (단, 인덱스 추적 변수들은 0부터 시작하므로 1을 늘려서 출력)