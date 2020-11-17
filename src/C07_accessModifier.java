import myobj.C07_diffPackage;

public class C07_accessModifier extends C07_diffPackage{

	// # ���� ���� (include)
	//	- ����� ���� �ش� Ŭ������ �����ϴ� ��
	//	- ���� ���� ���յ��� ���Ѵ�
	
	// # ���� ���� (dependency)
	//	- �ϳ��� Ŭ������ �ٸ� Ŭ������ ����ϴ� ��
	
	// # ���� ������ (Access Modifier)
	//	- �ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ��� �� �� �ش� ��ü���� �Ÿ��� ���� ��� ���θ� �����Ѵ�

    // # ������ �� �ִ� �Ÿ��� ����
	//	- ���� Ŭ���� ������ �ٸ� �ڿ� (���� �����)
	//	- ���� ��Ű�� ������ �ٸ� �ڿ�
	//	- �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	//	- �ٸ� ��Ű���� �ڿ� (���� ��)
	
	// # ���� �������� ����
	//	- private     : ���� Ŭ���� ���ο����� ����� �� �ִ� �ڿ��� �ȴ�
	//	- �ƹ��͵� �Ⱦ�   : default. �ٸ� ��Ű�������� ����� �� ���� �ڿ��� �ȴ�
	//	- protected   : �ٸ� ��Ű�������� ����� ������ �� �� �ִ� �ڿ��� �ȴ� (���� ��Ű�������� �����Ӱ� ����� �����ϴ�) 
	//	- public      : ���� �� �Ÿ������� �����Ӱ� �� �� �ִ� �ڿ��� �ȴ� (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	
	// # ��ü���⿡���� ĸ��ȭ (Encapsulation)
	//	- ���� �����ڸ� Ȱ���Ͽ� �ٸ� Ŭ�������Դ� ������ �ʿ� ���� �ڿ� (����/�޼���)�� �����ϴ� ���� ���Ѵ�
	                                                                                                                                                           
	
	public static void main(String[] args) {
		
		// ���� ��Ű�� ������ �ڿ��� private�� �����ϰ� ��� ����� �� �ִ�
		System.out.println(C07_samePackage.package_sInt);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);
		
		C07_samePackage same_package_instance = new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_int);
		System.out.println(same_package_instance.public_int);
		
		// �ٸ� ��Ű���� �ڿ��� ����� ������ protected���� ���δ� (visable)
		System.out.println(C07_diffPackage.public_sInt);
		System.out.println(C07_diffPackage.protected_static_sInt);
		
		C07_diffPackage diff_package_instance = new C07_diffPackage();
		System.out.println(diff_package_instance.public_int);
		
		// ��ӹ��� ��ü�� �ν��Ͻ��� protected �ڿ��� ������ �� �ִ�
		// (diffŬ������ modif�� ��ӹ޾����Ƿ� modif�� �ν��Ͻ��� ���� ����)
		C07_accessModifier child = new C07_accessModifier();
		
		System.out.println(child.protected_int);
		System.out.println(child.public_int);
		
	}

}
