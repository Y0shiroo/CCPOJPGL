public class List {
	int _book1;
	int _book2;
	int _book3;

	public List(int _book1, int _book2, int _book3,	int _book4)
  {
        this._book1 = _book1;
        this._book2 = _book2;
        this._book3 = _book3;
	}
	public int get_copy1() {
		return _book1;
	}
	public void set_copy1(int _copy) {
		this._book1 = _copy;
	}
	public int get_copy2() {
		return _book2;
	}
	public void set_copy2(int _copy) {
		this._book2 = _copy;
	}
	public int get_copy3() {
		return _book3;
	}
	public void set_copy3(int _copy) {
		this._book3 = _copy;
	}
}

