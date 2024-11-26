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
	private String confilmPassword;

	@AssertTrue(message = "確認用パスワードが一致しません")
	public boolean isPasswordValid() {
		if (password == null || password.isEmpty()) {
			return true;
		}
		return password.equals(confilmPassword);
	} 

	public String getConfilmPassword() {
		return confilmPassword;
	}

	public void setConfilmPassword(String confilmPassword) {
		this.confilmPassword = confilmPassword;
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
				+ ", confilmPassword=" + confilmPassword + "]";
	}

}
