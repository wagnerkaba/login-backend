# DOCKER UTILIZADO PARA POSTGRES LOCAL

## Criar container docker do Postgres

`docker run --name login-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user -e POSTGRES_PASSWORD=pwd -e POSTGRES_DB=login-data postgres`

## Entrar no shell do container

`docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash`

## Entrar no Postgres Shell

`psql -h localhost -U postgres_user login-data`

## Psql commands

- `\list` or `\l`: list all databases
- `\c <db name>`: connect to a certain database
- `\dt`: list all tables in the current database using your `search_path`
- `\dt *.`: list all tables in the current database regardless your `search_path`
- `\d <table_name>` : To describe a table such as a column, type, modifiers of columns, etc.

