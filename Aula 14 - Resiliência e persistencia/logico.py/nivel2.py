with open("log_sistema.txt", "w") as arquivo_log:

    arquivo_log.write("Sistema iniciado com sucesso.\n")

try:

    print("Enviando arquivo...")

except Exception as erro:

    print("Erro ao enviar arquivo.")

finally:

    print("Rotina de persistência finalizada, recursos liberados.")