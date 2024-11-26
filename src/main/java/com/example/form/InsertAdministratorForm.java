package com.example.form;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "必須入力です")
	private String name;
	/** メールアドレス */
	@NotBlank(message = "必須入力です")
	@Email(message = "Emailアドレスの形式が不正です")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "必須入力です")
	@Size(min = 5, message = "5文字以上で入力してください")
	private String password;
	
	@NotBlank(message = "必須入力です")
	private String password2;

	@AssertTrue(message = "確認用パスワードが一致しません")
	public boolean isPasswordValid() {
		if (password == null || password.isEmpty()) {
			return true;
		}
		return password.equals(password2);
	} 

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", password2=" + password2 + "]";
	}

}
