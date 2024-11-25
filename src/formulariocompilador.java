import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


/*
 * Created by JFormDesigner on Sun Nov 24 16:28:25 AST 2024
 */



/**
 * @author SAMUL
 */
public class formulariocompilador extends JFrame {
    public formulariocompilador() {
        initComponents();
    }

    private void Analizarlexico(ActionEvent e) {
        // Obtener el código ingresado por el usuario en 'entradatexto'
        String codigoFuente = entradatexto.getText();

        // Limpiar el área de resultados previos
        lexico.setText("");

        try {
            // Utilizar el analizador léxico de ANTLR para analizar el código fuente
            String resultado = Analizadorlexico.analyzeLexical(codigoFuente);

            // Mostrar los resultados del análisis léxico en el área de texto 'lexico'
            lexico.setText(resultado);

        } catch (Exception ex) {
            // En caso de error, mostrar el mensaje de error en el área 'lexico'
            lexico.setText("Error: " + ex.getMessage());
        }
    }

    private void Analizarsintactico(ActionEvent e) {

        String codigoFuente = entradatexto.getText();

        // Limpiar el área de resultados previos
        sintactico.setText("");

        try {
            // Utilizar el analizador sintáctico
            String resultadoSintactico = Analizadorsintactico.analyzeSyntax(codigoFuente);

            // Mostrar el resultado del análisis en el área de texto
            sintactico.setText(resultadoSintactico);

        } catch (Exception ex) {
            // En caso de error, mostrar el mensaje de error
            sintactico.setText("Error inesperado: " + ex.getMessage());
        }
    }

    private void Parsertree(ActionEvent e) {
        // Obtener el texto del input del usuario
        String codigoFuente = entradatexto.getText();

        // Limpiar el área de resultados previos
        generararbol.setText("");  // El JTextArea donde mostrarás el árbol de análisis

        try {
            // Obtener el árbol sintáctico
            String resultadoArbol = Arbolparser.analyzeTree(codigoFuente);

            // Mostrar el árbol en el JTextArea
            generararbol.setText(resultadoArbol);

        } catch (Exception ex) {
            // En caso de error, mostrar el mensaje de error
            generararbol.setText("Error en el análisis sintáctico: " + ex.getMessage());
        }
    }

    private void Analizarsemantico(ActionEvent e) {
        // Obtener el código escrito en el área de texto de entrada
        semantico.setText("");
        String code = entradatexto.getText(); // Asumimos que entradaTexto es un JTextArea

        try {
            // Crear el flujo de caracteres de la entrada
            CharStream input = CharStreams.fromString(code);

            // Crear el lexer
            AmaranteLexer lexer = new AmaranteLexer(input);

            // Crear el flujo de tokens a partir del lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Crear el parser
            AmaranteParser parser = new AmaranteParser(tokens);

            // Iniciar el análisis sintáctico en la regla de inicio de la gramática
            ParseTree tree = parser.programa();

            // Crear el listener de análisis semántico
            SemanticAnalyzerListener semanticListener = new SemanticAnalyzerListener(semantico);

            // Recorrer el árbol de análisis con el listener
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(semanticListener, tree);

            // Mostrar mensaje de finalización del análisis
            semantico.append("Análisis semántico completado.\n");

        } catch (Exception ex) {
            // Manejo de errores durante el análisis
            semantico.append("Error durante el análisis: " + ex.getMessage() + "\n");
            ex.printStackTrace();  // Muestra detalles adicionales en caso de error
        }

    }

    private void Generarintermedio(ActionEvent e) {
        // Limpiar el JTextArea "codigointermedio" antes de generar el nuevo código
        codigointermedio.setText("");  // Limpiar el contenido del JTextArea "codigointermedio"

        // Obtener el código de entrada desde el JTextArea "entradatexto"
        String code = entradatexto.getText();

        try {
            // Crear el flujo de caracteres de la entrada
            CharStream input = CharStreams.fromString(code);

            // Crear el lexer con el flujo de entrada
            AmaranteLexer lexer = new AmaranteLexer(input);

            // Crear el flujo de tokens a partir del lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Crear el parser con el flujo de tokens
            AmaranteParser parser = new AmaranteParser(tokens);

            // Iniciar el análisis sintáctico en la regla de inicio de la gramática
            ParseTree tree = parser.programa();  // Asegúrate de que 'programa' sea el punto de entrada de tu gramática

            // Crear el visitante para la generación de código intermedio
            CodeGenerationVisitor codeGenVisitor = new CodeGenerationVisitor();

            // Generar el código intermedio a partir del árbol de análisis
            String generatedCode = codeGenVisitor.visit(tree);

            // Mostrar el código intermedio generado en el JTextArea "codigointermedio"
            codigointermedio.append("Código intermedio generado:\n" + generatedCode + "\n");

        } catch (Exception ex) {
            // Mostrar un error en caso de que algo falle durante el proceso
            codigointermedio.append("Error durante el análisis: " + ex.getMessage() + "\n");
        }

    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - elias amarante
        scrollPane1 = new JScrollPane();
        entradatexto = new JTextArea();
        scrollPane2 = new JScrollPane();
        lexico = new JTextArea();
        Analizarlexico = new JButton();
        Limpiarlexico = new JButton();
        Analizarsintactico = new JButton();
        Limpiarsintactico = new JButton();
        splitPane1 = new JSplitPane();
        scrollPane3 = new JScrollPane();
        sintactico = new JTextArea();
        splitPane2 = new JSplitPane();
        scrollPane4 = new JScrollPane();
        semantico = new JTextArea();
        Analizarsemantico = new JButton();
        Limpiarsemantico = new JButton();
        splitPane3 = new JSplitPane();
        scrollPane5 = new JScrollPane();
        codigointermedio = new JTextArea();
        Generarintermedio = new JButton();
        Limpiarintermedio = new JButton();
        label1 = new JLabel();
        separator1 = new JSeparator();
        scrollPane6 = new JScrollPane();
        generararbol = new JTextArea();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        Parsertree = new JButton();
        Limpiartree = new JButton();
        label7 = new JLabel();

        //======== this ========
        setFont(new Font("Times New Roman", Font.PLAIN, 18));
        setTitle("CompiladorAmarante");
        var contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- entradatexto ----
            entradatexto.setBorder(new CompoundBorder(
                new BasicBorders.MarginBorder(),
                null));
            entradatexto.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            entradatexto.setCaretColor(new Color(0xff3333));
            scrollPane1.setViewportView(entradatexto);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(lexico);
        }

        //---- Analizarlexico ----
        Analizarlexico.setText("Analizar");
        Analizarlexico.addActionListener(e -> Analizarlexico(e));

        //---- Limpiarlexico ----
        Limpiarlexico.setText("Limpiar");

        //---- Analizarsintactico ----
        Analizarsintactico.setText("Analizar");
        Analizarsintactico.addActionListener(e -> Analizarsintactico(e));

        //---- Limpiarsintactico ----
        Limpiarsintactico.setText("Limpiar");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(sintactico);
        }

        //======== scrollPane4 ========
        {
            scrollPane4.setViewportView(semantico);
        }

        //---- Analizarsemantico ----
        Analizarsemantico.setText("Analizar");
        Analizarsemantico.addActionListener(e -> Analizarsemantico(e));

        //---- Limpiarsemantico ----
        Limpiarsemantico.setText("Limpiar");

        //======== scrollPane5 ========
        {
            scrollPane5.setViewportView(codigointermedio);
        }

        //---- Generarintermedio ----
        Generarintermedio.setText("Analizar");
        Generarintermedio.addActionListener(e -> Generarintermedio(e));

        //---- Limpiarintermedio ----
        Limpiarintermedio.setText("Limpiar");

        //---- label1 ----
        label1.setText("Insertar el codigo ");
        label1.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));

        //======== scrollPane6 ========
        {
            scrollPane6.setViewportView(generararbol);
        }

        //---- label2 ----
        label2.setText("Analizador lexico");

        //---- label3 ----
        label3.setText("Analizador sintactico");

        //---- label4 ----
        label4.setText("Analizador semantico");

        //---- label5 ----
        label5.setText("Generador de codigo intermedio");

        //---- label6 ----
        label6.setText("Arbol parser");

        //---- Parsertree ----
        Parsertree.setText("Analizar");
        Parsertree.addActionListener(e -> Parsertree(e));

        //---- Limpiartree ----
        Limpiartree.setText("Limpiar");

        //---- label7 ----
        label7.setText("Compilador Amarante");
        label7.setFont(new Font("Inter", Font.PLAIN, 36));
        label7.setBorder(new TitledBorder("text"));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3)
                            .addGap(86, 86, 86))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(Analizarlexico)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Limpiarlexico, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(splitPane2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(Analizarsintactico, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(125, 125, 125)
                                            .addComponent(Limpiarsintactico, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane1)
                            .addContainerGap())
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(splitPane3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(Analizarsemantico)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Limpiarsemantico))
                                        .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(splitPane1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(separator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(Generarintermedio)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Limpiarintermedio)
                                            .addGap(12, 12, 12))))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label5)
                                    .addGap(35, 35, 35)))
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addComponent(Parsertree)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Limpiartree)))
                                    .addGap(0, 42, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(label6)
                                    .addContainerGap(147, Short.MAX_VALUE))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                            .addComponent(label1)
                            .addGap(391, 391, 391))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label2)
                                .addComponent(label3)
                                .addComponent(label4))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(splitPane3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                                .addComponent(splitPane2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(Analizarsintactico)
                                                .addComponent(Limpiarsintactico)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                            .addComponent(scrollPane2)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(Analizarlexico)
                                                .addComponent(Limpiarlexico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(Limpiarsemantico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(Analizarsemantico, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addContainerGap())))
                        .addComponent(splitPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label5)
                                .addComponent(label6))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addComponent(separator1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18))
                                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(Parsertree)
                                .addComponent(Limpiartree)
                                .addComponent(Limpiarintermedio)
                                .addComponent(Generarintermedio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - elias amarante
    private JScrollPane scrollPane1;
    private JTextArea entradatexto;
    private JScrollPane scrollPane2;
    private JTextArea lexico;
    private JButton Analizarlexico;
    private JButton Limpiarlexico;
    private JButton Analizarsintactico;
    private JButton Limpiarsintactico;
    private JSplitPane splitPane1;
    private JScrollPane scrollPane3;
    private JTextArea sintactico;
    private JSplitPane splitPane2;
    private JScrollPane scrollPane4;
    private JTextArea semantico;
    private JButton Analizarsemantico;
    private JButton Limpiarsemantico;
    private JSplitPane splitPane3;
    private JScrollPane scrollPane5;
    private JTextArea codigointermedio;
    private JButton Generarintermedio;
    private JButton Limpiarintermedio;
    private JLabel label1;
    private JSeparator separator1;
    private JScrollPane scrollPane6;
    private JTextArea generararbol;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton Parsertree;
    private JButton Limpiartree;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
