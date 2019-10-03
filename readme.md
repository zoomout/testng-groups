# Test NG groups usage examples
### Run all
```
 mvn clean test
```
Result
```
BEFORE SUITE

  beforeClass Test2
   datProvider test2
   beforeGroup2
    beforeMethod test2
      test2 Group2 1
    afterMethod test2
    beforeMethod test2
      test2 Group2 2
    afterMethod test2
  afterClass Test2

  beforeClass Test1Common
   beforeGroup1
    beforeMethod test1B
      test1B Group1
    afterMethod test1B
  afterClass Test1Common

  beforeClass Test1Common
    beforeMethod test1C
      test1C Group2
    afterMethod test1C
   afterGroup2
  afterClass Test1Common

  beforeClass Test1Common
    beforeMethod test1A
      test1A Group1
    afterMethod test1A
   afterGroup1
  afterClass Test1Common

AFTER SUITE
```
### Run group1
```
 mvn clean test -Dgroups=group1
```
Result
```
BEFORE SUITE

  beforeClass Test1Common
   beforeGroup1
    beforeMethod test1A
      test1A Group1
    afterMethod test1A
  afterClass Test1Common

  beforeClass Test1Common
    beforeMethod test1B
      test1B Group1
    afterMethod test1B
   afterGroup1
  afterClass Test1Common

AFTER SUITE
```
### Run group2
```
 mvn clean test -Dgroups=group2
```
Result
```
BEFORE SUITE

  beforeClass Test1Common
   beforeGroup2
    beforeMethod test1C
      test1C Group2
    afterMethod test1C
  afterClass Test1Common

  beforeClass Test2
   datProvider test2
    beforeMethod test2
      test2 Group2 1
    afterMethod test2
    beforeMethod test2
      test2 Group2 2
    afterMethod test2
   afterGroup2
  afterClass Test2

AFTER SUITE
```