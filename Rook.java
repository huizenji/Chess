package Project3;

public class Rook extends ChessPiece {

	public Rook(Player player) {
		
		super(player);
		
	}

	public String type() {
		
		return "Rook";
		
	}
	
	// determines if the move is valid for a rook piece
	public boolean isValidMove(Move move, IChessPiece[][] board) {


		boolean valid = true;

		if(!(move.toRow - move.fromRow == 0 ||
		move.toColumn - move.fromColumn == 0))
        // More code is needed
			valid = false;

        return valid;


		
	}
	
}
