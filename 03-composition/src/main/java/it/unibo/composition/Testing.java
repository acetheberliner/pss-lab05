package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student marioRossi = new Student(1, "Mario", "Rossi", "123456", 2020);
        Student luigiVerdi = new Student(2, "Luigi", "Verdi", "654321", 2021);
        Student paoloNeri = new Student(3, "Paolo", "Neri", "913745", 2022);

        // 2)Creare 2 docenti a piacere
        Professor profLaghi = new Professor(1, "Matteo", "Laghi", "000000", new String[] {"Storia", "Filosofia"});
        Professor profCasalini = new Professor(2, "Luca", "Casalini", "mamma", new String[] {"Biologia", "Chimica"});

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room2_3 = new ExamRoom(50, "Aula 2.3", true, true);
        ExamRoom room3_11 = new ExamRoom(150, "Aula 3.11", false, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        Exam storia = new Exam(1, 10, profLaghi.getCourses()[0], profLaghi, room2_3);
        Exam chimica = new Exam(2, 2, profCasalini.getCourses()[1], profCasalini, room3_11);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        storia.registerStudent(marioRossi);
        storia.registerStudent(luigiVerdi);
        storia.registerStudent(paoloNeri);
        chimica.registerStudent(marioRossi);
        chimica.registerStudent(luigiVerdi);
        chimica.registerStudent(paoloNeri);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(storia.toString());
        System.out.println("");
        System.out.println(chimica.toString());
    }
}
