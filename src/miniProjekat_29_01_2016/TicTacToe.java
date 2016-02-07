package miniProjekat_29_01_2016;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Ellipse;

public class TicTacToe extends Application {
	
	/**
	 * Kod uzet i prepravljen iz knjige JAVA, odakle i radimo zadatke.
	 */

	// Ko je na redu:
	private char whoseTurn = 'X';
	// Æelija / matrica u kojoj æe se igrati
	private Cell[][] matrica = new Cell[3][3];

	// Label koji ispisuje ko igra.
	private Label status = new Label("X igra sada.");

	@Override
	
	// metoda za start
	// petlja koja se koristi za pravljenje "æelija" u koje æemo smjestiti X i O
	public void start(Stage primaryStage) {
		GridPane grid = new GridPane();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				grid.add(matrica[i][j] = new Cell(), j, i);

		// nakon petlje, dodajemo tu sve u grid
		// te njega dodajemo u naš "box"
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(grid);
		borderPane.setBottom(status);

		// main - frame box u koji smještamo kutijce za klikanje
		// visina x širina igre je 400 x 400
		Scene scene = new Scene(borderPane, 400, 400);
		// na vrhu stavljamo koja je igra
		primaryStage.setTitle("TicTacToe igra");
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	// metoda koja provjerava da li su sve æelije ispunjene
	public boolean isFull() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (matrica[i][j].getToken() == ' ')
					return false;
		return true;
	}

	// provjerava da li je igraè sa odreðenim tokenom (X ili O) pobijedio
	public boolean isWon(char token) {
		for (int i = 0; i < 3; i++)
			if (matrica[i][0].getToken() == token && matrica[i][1].getToken() == token
					&& matrica[i][2].getToken() == token) {
				return true;
			}

		for (int j = 0; j < 3; j++)
			if (matrica[0][j].getToken() == token && matrica[1][j].getToken() == token
					&& matrica[2][j].getToken() == token) {
				return true;
			}

		if (matrica[0][0].getToken() == token && matrica[1][1].getToken() == token
				&& matrica[2][2].getToken() == token) {
			return true;
		}
		if (matrica[0][2].getToken() == token && matrica[1][1].getToken() == token
				&& matrica[2][0].getToken() == token) {
			return true;
		}

		return false;
	}
	// glavna æelija
	public class Cell extends Pane {
		// ispunjavamo je praznim mjestima, na koje mogu iæi X ili O
		private char token = ' ';

		public Cell() {
			setStyle("-fx-border-color: black");
			this.setPrefSize(2000, 2000);
			this.setOnMouseClicked(e -> handleMouseClick());
		}

		// vraæa token onog igraèa koji je pritisnuo u odreðeno polje
		public char getToken() {
			return token;
		}

		// postavlja novi token
		public void setToken(char c) {
			token = c;
			
			// pravimo vizuelni token "X"
			if (token == 'X') {
				Line line1 = new Line(10, 10, this.getWidth() - 10, this.getHeight() - 10);
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				Line line2 = new Line(10, this.getHeight() - 10, this.getWidth() - 10, 10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));
				
				this.getChildren().addAll(line1, line2);
				
				// te pravimo vizuelni izgled tokena "O"
			} else if (token == 'O') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));

				ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.WHITE);
				getChildren().add(ellipse); 
			}
		}

		// handler za klik mišom
		private void handleMouseClick() {
			// ako æelija nije prazna i nije kraj
			if (token == ' ' && whoseTurn != ' ') {
				// postavlja token trenutnog igraèa u to polje
				setToken(whoseTurn); 

				// provjerava status igre
				if (isWon(whoseTurn)) {
					status.setText(whoseTurn + " je pobijedio! Game Over");
					whoseTurn = ' ';
				} else if (isFull()) {
					status.setText("Neriješeno!");
					whoseTurn = ' ';
				} else {
					// promjena turna - tj. ko je na redu
					whoseTurn = (whoseTurn == 'X') ? 'O' : 'X';
					// te ispisuje ko je na redu u status labelu
					status.setText(whoseTurn + " je na redu.");
				}
			}
		}
	}
}