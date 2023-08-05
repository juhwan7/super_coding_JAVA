from fastapi import FastAPI
from fastapi.staticfiles import StaticFiles
from pydantic import BaseModel


class Chat(BaseModel):
    id: str
    chat: str


chat = {"1221": "김주환"}

app = FastAPI()


# 채팅입력
@app.post("/chat")
def create_chat(chat: Chat):
    chat.append(chat)
    return 200

# 채팅보이기


@app.get("/chat")
async def root():
    return chat


app.mount("/", StaticFiles(directory="static", html=True), name="static")
