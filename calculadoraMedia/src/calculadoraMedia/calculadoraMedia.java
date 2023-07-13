package calculadoraMedia;

import javax.swing.JOptionPane;

public class calculadoraMedia {
	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota");;
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		
		double media = (dNota1 + dNota2 + dNota3)/3 ;
		
		if(media >=7) {
			if(media >=9) {
				JOptionPane.showMessageDialog(null, "Parabéns sua nota foi a melhor" + media);
			}
			JOptionPane.showMessageDialog(null,"Aluno aprovado: " + media);
		}
		else if(media ==6 || media <=6.9) {
			JOptionPane.showMessageDialog(null,"Aluno de recuperacão: " + media);
		}
		else {
			JOptionPane.showMessageDialog(null,"Aluno reprovado: " + media );
		}
	}
}
