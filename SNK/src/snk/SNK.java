/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snk;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author pc
 */
public class SNK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame ventana = new JFrame("shingeki no kyojin");
        ventana.setSize(1000, 1000);
        ventana.setBounds(250, 50, 300, 220);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);

        agregarComponentes(panel, ventana);
        ventana.setVisible(true);
    }

    private static void agregarComponentes(JPanel panel, JFrame ventanaPrincipal) {
        JButton button = new JButton("Titán Fundador");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        JButton button2 = new JButton("Titán de Ataque");
        button2.setBounds(10, 120, 120, 25);
        panel.add(button2);
        
        JButton button3 = new JButton("Titán Colosal");
        button3.setBounds(10, 80, 120, 25);
        panel.add(button3);

        JButton button4 = new JButton("Titán Acorazado");
        button4.setBounds(10, 80, 120, 25);
        panel.add(button4);

        JButton button5 = new JButton("Titán Hembra");
        button5.setBounds(10, 80, 120, 25);
        panel.add(button5);

        JButton button6 = new JButton("Titán Bestia");
        button6.setBounds(10, 80, 120, 25);
        panel.add(button6);

        JButton button7 = new JButton("Titán Mandíbula");
        button7.setBounds(10, 80, 120, 25);
        panel.add(button7);

        JButton button8 = new JButton("Titán Carguero");
        button8.setBounds(10, 80, 120, 25);
        panel.add(button8);

        JButton button9 = new JButton("Titán Martillo de Guerra");
        button9.setBounds(10, 80, 120, 25);
        panel.add(button9);        

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán Fundador", "Se trata del titán más poderoso de todos ya que puede crear titanes puros y controlar todas sus acciones. Ymir Fritz se convirtió en el primer Titán Fundador, así que este poder sólo puede ser heredado por los individuos que pertenezcan al linaje real de Eldia, los Fritz o los Reiss. Sin embargo, cualquier otra persona puede conseguir este poder al entrar en contacto con una persona de sangre real. El protagonista Eren Jaeger es el actual portador del Titán Fundador que lo consiguió tras devorar a su padre Grisha Jaeger. El joven encontró al titán que devoró a su madre que se trata de Dina Fritz, descendiente de la familia real y primera mujer de su padre.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Ataque", "Tras la Gran Guerra de los Titanes, el país de Marley consiguió a 7 de los 9 titanes. Uno de los que se resistió fue el Titán de Ataque que siempre ha luchado por la libertad de Eldia. El primer portador conocido fue Eren Kruger. Este salva a Grisha Jaeger en la frontera de Paradis y sale del titán para terminar su vida después de 13 años. Kruger le pide a Grisha que consiga el poder del Titán Fundador para salvar a la humanidad, así que este tiene que devorar a Kruger para conseguir el poder del Titán de Ataque que a su vez lo heredaría Eren Jaeger cuando devora a su padre.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Colosal", "El Titán Colosal se reconoce muy fácilmente por su aspecto y fue uno de los primeros titanes en aparecer en la serie. Es el más grande y fuerte físicamente, aunque también es lento. Como habilidad única, es capaz de expulsar grandes cantidades de vapor caliente por todo su cuerpo sin necesidad de recibir daño. Esto es útil en combate, pero también conlleva la pérdida de masa muscular como se ha podido ver en el anime. No se conocen los primeros portadores del Titán Colosal, pero uno de los reclutas del Cuerpo de Exploración escondió su identidad desde el principio.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });
        
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Acorazado", "Como su propio nombre indica, el Titán Acorazado destaca por la dureza de su piel, extremadamente gruesa. Por esa razón, tanto el Titán Colosal como el Acorazado se consideran tan letales. Es muy difícil atravesar su piel con una espada o una bala de cañón, pero además destaca por su velocidad mejorada. Sin embargo, un mayor volumen le limita los movimientos y es capaz de desprenderse de partes de su armadura para correr mucho más rápido. El único portador que se conoce es Reiner Braun, otro de los miembros del Cuerpo de Exploración que no se separa de Bertolt Hoover.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Hembra", "El primer encuentro con el Titán Hembra dejó muchas evidencias sobre quién podría estar detrás de ese gigante. Todas las pistas apuntaban a Annie Leonhart y poco después se confirmó. Aunque los titanes no son capaces de comunicarse con los humanos, el Titán Hembra demostró que puede atraer a los demás titanes por medio de un grito. Así consiguió escapar de la emboscada del Cuerpo de Exploración y no es el único recurso que la hace tan fuerte.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });
        
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Bestia", "Todos los titanes tienen un aspecto singular, en especial el Titán Bestia. El portador de este poder tiene una gran fuerza física y es capaz de convertir a los seres humanos en titanes. Zeke Jaeger, hijo de Grisha y Dina Fritz, tiene este poder heredado del científico Tom Xaver del que no se sabe mucho más. Zeke lleva siempre las gafas que pertenecieron a Xaver pese a que no le hacen falta. A diferencia de otros titanes, el Titán Bestia tiene aspecto de animal peludo como si fuera un gorila gigante y la capacidad de hablar el lenguaje humano con fluidez.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        }); 
        
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Mandíbula", "El primer portador conocido es Marcel Galliard que colaboró en la guerra de expansión territorial de Marley, donde fue utilizado como un arma militar. Antes de atacar la isla de Paradis, Marcel evitó que un titán cogiera a Reiner Braun, sacrificándose él. Este titán era una niña eldiana llamada Ymir y se infiltró en las murallas para sobrevivir.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        }); 
        
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Carguero", "Quizás sea uno de los titanes más desconocidos porque no tiene especial relevancia en la trama de la serie. Eso no quiere decir que no sea peligroso, ya que todos los titanes son utilizados como un arma de guerra desde hace siglos. El Titán Carguero tiene la habilidad de transformarse en un titán cuadrúpedo resistente para transportar cargas muy pesadas. Esto podría suponer un handicap para su velocidad, pero sigue siendo sorprendentemente ágil. Sólo se conoce a un portador que se llama Pieck Finger, una joven al servicio del gobierno de Marley.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });   
        
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentana("Titán de Martillo de Guerra", " Este titán puede endurecer su cuerpo como ninguno otro y capaz de crear estructuras con este poder. Así que cualquier estructura la puede convertir en un arma de corto alcance, armaduras o simplemente atrapar a sus enemigos con ellas. También puede dirigir al titán desde fuera del cuerpo, lo que le hace más letal, ya que está conectado al portador mediante una especie de cordón. Todo esto lo demostró la Srta Tybur cuando peleó con Eren.","C:\\Users\\pc\\OneDrive\\Escritorio\\F-M8lzjaYAAYK95.jpg");
            }
        });
    }

    private static void abrirVentana(String nombreVentana, String mensaje, String rutaImagen) {
        JFrame nuevaVentana = new JFrame(nombreVentana);
        nuevaVentana.setSize(800, 500);

        JLabel labelMensaje = new JLabel("<html>" + mensaje.replace("\n", "<br>") + "</html>");
        labelMensaje.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelImagen = new JLabel();
        ImageIcon icono = new ImageIcon(new ImageIcon(rutaImagen).getImage().getScaledInstance(150, 300, java.awt.Image.SCALE_SMOOTH));
        labelImagen.setIcon(icono);

        JPanel panelContenido = new JPanel();
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
        panelContenido.add(labelMensaje);
        panelContenido.add(labelImagen);
        nuevaVentana.add(panelContenido);
        nuevaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevaVentana.setVisible(true);
        
        JButton botonRegreso = new JButton("Regresar");
        botonRegreso.setBounds(100, 80, 1200, 255);
        panelContenido.add(botonRegreso);     
        
        botonRegreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevaVentana.dispose(); 
            }
        });
         }
    
}
