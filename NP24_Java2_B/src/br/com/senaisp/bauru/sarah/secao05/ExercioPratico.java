package br.com.senaisp.bauru.sarah.secao05;

import java.nio.channels.AcceptPendingException;

import javax.swing.JOptionPane;

public class ExercioPratico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resp = JOptionPane.showConfirmDialog(null, "Você está preparado?", "Preparado!.", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE)	== JOptionPane.YES_OPTION;
		JOptionPane.showMessageDialog(null, "Tudo bem, até logo!", "Obrigada",JOptionPane.OK_CANCEL_OPTION);
		
		
		String msg01 = (String) JOptionPane.showInputDialog(null, "Qual o seu nome?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		
		String msg02 = (String) JOptionPane.showInputDialog(null, "Qual a sua idade?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		
		String msg03 = (String) JOptionPane.showInputDialog(null, "Qual a sua cor favorita?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		String msg04 = (String) JOptionPane.showInputDialog(null, "Qual sua comida favorita?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		String msg05 = (String) JOptionPane.showInputDialog(null, "Qual a sua altura?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		String msg06 = (String) JOptionPane.showInputDialog(null, "Qual é o seu animal de estimação?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		String[] acceptableValues = {"Cachorro", "Gato ", "Cavalo", "Cobra"};
		String msg07 = (String) JOptionPane.showInputDialog(null, "Qual é o seu animal de estimação?", "Diga algo.", JOptionPane.QUESTION_MESSAGE, null, acceptableValues, acceptableValues[1]);
		
		String msg08 = (String) JOptionPane.showInputDialog(null, "Qual o seu dele?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
		
		String msg09 = (String) JOptionPane.showInputDialog(null, "O que você gosta de fazer?", "Digite algo aqui.", JOptionPane.INFORMATION_MESSAGE, null, null, "Digite algo aqui.");
					
	}

}
