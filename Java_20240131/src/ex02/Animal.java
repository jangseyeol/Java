/*
 * 문제: 동물원 관리 시스템
동물원에서 다양한 동물들을 관리하는 
간단한 시스템을 자바로 구현하세요.

기본 요구 사항:
동물 클래스 생성

Animal이라는 이름의 기본 동물 클래스를
만듭니다.
모든 동물은 makeSound() 메소드를
가지며, 이는 동물이 내는 소리를 
출력합니다.

다형성 사용

Animal 클래스를 상속받는 세 개의 
서브클래스, Dog, Cat, Bird를 
생성합니다.
각 서브클래스는 makeSound() 
메소드를 오버라이드하여 각 동물의 
특성에 맞는 소리를 출력합니다. 
예를 들어, Dog는 "멍멍", 
Cat은 "야옹", Bird는 "짹짹"이라고
출력합니다.
*/



package ex02;

public class Animal {
	void makeSound() {
		System.out.println();
	}
	
}
