export class Post {
    public id: number;
    public title: string;
    public content: string;
    public author: string;
    public created_date: string;
    public modified_date: string;

  constructor(id: number, title: string, content: string, author: string, created_date: string, modified_date: string) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.author = author;
    this.created_date = created_date;
    this.modified_date = modified_date;
  }

}
