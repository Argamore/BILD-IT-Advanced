package miniProjekat_29_01_2016;
/*
 * 
 * 
 * Zbog grešaka sa Eclipse-om, ne mogu da riješim nikako zašto neæe da pokrene ConnectFour
 * veæ pokrene opet TicTacToe..
 * 
 * :(
 * 
 * 
 */



import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class ConnectFourNotFull extends Application {
	private char player = 'R';

	// pravimo board / matricu velièine 6 * 6
	private CellX[][] board = new CellX[6][6];

	private Label statusLabel = new Label("Igra crveni.");

	// setup je u suštini priprema za pravljenje izgleda igre
	public void start(Stage pocetniStage) {
		GridPane grid1 = new GridPane();
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++)
				grid1.add(board[i][j] = new CellX(), j, i);

		// nakon petlje, dodajemo tu sve u grid
		// te njega dodajemo u naš "box"
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(grid1);
		borderPane.setBottom(statusLabel);

		// main - frame box u koji smještamo kutijce za klikanje
		// visina x širina igre je 600 x 600
		Scene scena = new Scene(borderPane, 600, 600);
		// na vrhu stavljamo koja je igra
		pocetniStage.setTitle("ConnectFour igra");
		pocetniStage.setScene(scena);
		pocetniStage.show();
	}

	public boolean checkFull() {
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++)
				if (board[i][j].vratiToken() == ' ')
					return false;
		return true;
	}

	public boolean checkWin(char token) {
		for (int i = 0; i < 6; i++)
			if (board[i][0].vratiToken() == token && board[i][1].vratiToken() == token
					&& board[i][2].vratiToken() == token && board[i][3].vratiToken() == token) {
				return true;
			}

		for (int j = 0; j < 6; j++)
			if (board[0][j].vratiToken() == token && board[1][j].vratiToken() == token
					&& board[2][j].vratiToken() == token && board[3][j].vratiToken() == token) {
				return true;
			}

		if (board[0][0].vratiToken() == token && board[1][1].vratiToken() == token && board[2][2].vratiToken() == token
				&& board[3][3].vratiToken() == token) {
			return true;
		}
		if (board[0][2].vratiToken() == token && board[1][1].vratiToken() == token && board[2][0].vratiToken() == token
				&& board[3][0].vratiToken() == token) {
			return true;
		}

		return false;
	}

	public class CellX extends Pane {
		// ispunjavamo je praznim mjestima, na koje mogu iæi R ili Y
		private char token1 = ' ';

		public CellX() {
			setStyle("-fx-border-color: black");
			this.setPrefSize(2000, 2000);
			this.setOnMouseClicked(e -> onMouseClick());
		}

		// vraæa token onog igraèa koji je pritisnuo u odreðeno polje
		public char vratiToken() {
			return token1;
		}

		// postavlja novi token
		public void postaviToken(char x) {
			token1 = x;

			// pravimo vizuelni token "R" - crveni krug
			if (token1 == 'R') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));

				ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.RED);
				getChildren().add(ellipse);

				// te pravimo vizuelni izgled tokena "Y" - žuti krug
			} else if (token1 == 'Y') {
				Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, this.getWidth() / 2 - 10,
						this.getHeight() / 2 - 10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));

				ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.YELLOW);
				getChildren().add(ellipse);
			}
		}

		private void onMouseClick() {
			// ako æelija nije prazna i nije kraj
			if (token1 == ' ' && player != ' ') {
				// postavlja token trenutnog igraèa u to polje
				postaviToken(player);

				// provjerava status igre
				if (checkWin(player)) {
					statusLabel.setText(player + " je pobijedio! Game Over");
					player = ' ';
				} else if (checkFull()) {
					statusLabel.setText("Neriješeno!");
					player = ' ';
				} else {
					// promjena turna - tj. ko je na redu
					player = (player == 'R') ? 'Y' : 'R';
					// te ispisuje ko je na redu u status labelu
					statusLabel.setText(player + " je na redu.");
				}
			}
		}
	}
}
