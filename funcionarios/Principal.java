package funcionarios;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Ana", "Realizada em 2020", 5000.50, "15 99012-3456", "Rua dos bobos, numero 0", "15/01/1998");
		System.out.println("---Funcionario------------------");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereco: " + funcionario.getEndereco());
		System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
		
		Administrador adm = new Administrador("Ana", "Realizada em 2020", 5000.50, "15 99012-3456", "Rua dos bobos, numero 0", "15/01/1998", 2007);
		System.out.println("---Administrador------------------");
		System.out.println("Nome: " + adm.getNome());
		System.out.println("Matricula: " + adm.getMatricula());
		System.out.println("Salario: " + adm.getSalario());
		System.out.println("Telefone: " + adm.getTelefone());
		System.out.println("Endereco: " + adm.getEndereco());
		System.out.println("Data de Nascimento: " + adm.getDataNascimento());
		System.out.println("Cra: " + adm.getCra());
		
		Engenheiro engenheiro = new Engenheiro("Ana", "Realizada em 2020", 5000.50, "15 99012-3456", "Rua dos bobos, numero 0", "15/01/1998", 2008);
		System.out.println("---Engenheiro------------------");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matricula: " + engenheiro.getMatricula());
		System.out.println("Salario: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereco: " + engenheiro.getEndereco());
		System.out.println("Data de Nascimento: " + engenheiro.getDataNascimento());
		System.out.println("Crea: " + engenheiro.getNumCrea());
		
		Medico medico = new Medico("Ana", "Realizada em 2020", 5000.50, "15 99012-3456", "Rua dos bobos, numero 0", "15/01/1998", 2009);
		System.out.println("---Medico------------------");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matricula: " + medico.getMatricula());
		System.out.println("Salario: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereco: " + medico.getEndereco());
		System.out.println("Data de Nascimento: " + medico.getDataNascimento());
		System.out.println("Cra: " + medico.getCrm());		
	}
}
