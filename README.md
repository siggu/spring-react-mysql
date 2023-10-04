# spring-react-mysql

<details>
  <summary>Board REST API 명세서</summary>
  <div markdown="1">
    <a href="https://prickle-textbook-12d.notion.site/Hoons-Board-REST-API-89f600999f6548ff998d8ec8211062a7">Hoons Board REST API 명세서</a>
  </div>
</details>

### DDL 작성 시

`CREATE USER 'developer'@'*' IDENTIFIED BY 'P!ssw0rd';`

- 해당 명령은 일반적으로 `MySQL` 또는 `MariaDB`와 같은 데이터베이스 시스템에서 허영되지 않는다. 이런 데이터베이스 시스템에서는 일반적으로 호스트(IP 주소 또는 호스트 이름)을 명시하여 사용자를 만들어야 한다.
  > 보안상의 이유로 허용되지 않음

- 해결 방법은 호스트를 지정해 사용자를 만드는 것이다.
  - `localhost`에서만 접속할 수 있도록 만들기
      ```sql
      CREATE USER 'developer'@'localhost' IDENTIFIED BY 'P!ssw0rd';
      ```
      - `developer` 사용자는 로컬 호스트에서만 접속할 수 있다.

  - 모든 호스트에서 접속할 수 있도록 만들기
      ```sql
      CREATE USER 'developer'@'%' IDENTIFIED BY 'P!ssw0rd';
      ```

      - `developer` 사용자는 모든 호스트에서 접속할 수 있다. 하지만 이렇게 설정하면 보안에 취약해질 수 있다.
> 나중에 고침
