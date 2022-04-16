import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExemplePourL3G {

	public void exempleDeLecture1(String cheminVersFichier) {

		File fsource = new File(cheminVersFichier);
		try {
			FileReader fr = new FileReader(fsource);
			BufferedReader br = new BufferedReader(fr);

			String[] toutesLesLignes = new String[0];

			while (br.ready()) {
				String s = br.readLine();
				toutesLesLignes = Arrays.copyOf(toutesLesLignes, toutesLesLignes.length + 1);
				toutesLesLignes[toutesLesLignes.length - 1] = s;
			}

			int i = 0;
			for (String ligne : toutesLesLignes) {
				System.out.println("[Ligne " + i + "]" + ligne);
				i++;
			}

			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void exempleDeLecture2(String cheminVersFichier) {

		Path fsource = Paths.get(cheminVersFichier);
		try {
			List<String> touteslesLignes = Files.readAllLines(fsource);
			String allContent = Files.readString(fsource); // si on souhaite tout récupérer en une seule ligne
			int i = 0;
			for (String ligne : touteslesLignes) {
				System.out.println("[Ligne " + i + "]" + ligne);
				i++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

// ----------------
	public void exempleEcriture1(String cheminVersFichier, String[] donneesAEcrire) {

		File fcible = new File(cheminVersFichier);

		try {
			if (!fcible.exists())
				fcible.createNewFile();

			FileWriter fw = new FileWriter(fcible); // on l'ouvre pas en ajout
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < donneesAEcrire.length; i++) {
				bw.append(donneesAEcrire[i] + "\n");
			}
			bw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// en utilisant une string qui écrit tout un texte préalablement stocké dans un
	// tableau de chaines
	public void exempleEcriture2(String cheminVersFichier, String[] donneesAEcrire) {

		Path fCible = Paths.get(cheminVersFichier);

		try {
			if (!Files.exists(fCible))
				Files.createFile(fCible);
			String monTexte = "";
			for (int i = 0; i < donneesAEcrire.length; i++)
				monTexte += donneesAEcrire[i] + "\n";
			Files.writeString(fCible, monTexte, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// choisissez les versions 1 ou 2 selon votre préférence 
		
		ExemplePourL3G epl3g = new ExemplePourL3G();
		epl3g.exempleDeLecture2("nio/ExemplePourL3G.java"); // je vais me lire moi-même

		System.out.println(" ... et maintenant on va créer et écrire dans un fichier ");

		String[] data2Write = { "Bonjour", "Monde", "et L3G", "en particulier" };
		epl3g.exempleEcriture1("nio/ExemplePourL3G.txt", data2Write);
	}

}