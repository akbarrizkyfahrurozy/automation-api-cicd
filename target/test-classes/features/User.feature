Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: GET - Mendapatkan semua data post
    Given I set GET url posts
    When I send get HTTP request
    Then I receive valid HTTP response code 200

  Scenario: POST - Membuat data post baru
    Given I set post api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: GET - Mendapatkan data post berdasarkan ID
    Given I set GET url posts
    When I send get HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user

  Scenario: PUT - Mengubah data post berdasarkan ID
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for updated user

  Scenario: DELETE - Menghapus data post berdasarkan ID
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200 delete